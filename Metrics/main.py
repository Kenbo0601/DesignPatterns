import time

# Matrics Class for WebServer monitoring 
class MetricsCollector:
    def __init__(self):
        self.metrics = {}

    # count http requests
    def increment_counter(self, name):
        if name not in self.metrics:
            self.metrics[name] = {"count": 0}
        self.metrics[name]["count"] += 1

    # record timer for each http request
    def record_timer(self, name, duration):
        if name not in self.metrics:
            self.metrics[name] = {"durations": []}
        self.metrics[name]["durations"].append(duration)

    
    def get_metrics(self):
        aggregated = {}
        for name, data in self.metrics.items():
            if "count" in data:
                aggregated[name] = {"count": data["count"]}
            if "durations" in data:
                durations = data["durations"]
                aggregated[name] = {
                    "min": min(durations),
                    "max": max(durations),
                    "average": sum(durations) / len(durations),
                }
        return aggregated


# Example Application with Metrics
class WebServer:
    def __init__(self, metrics_collector):
        self.metrics = metrics_collector

    def handle_request(self, request_id):
        start_time = time.time()
        self.metrics.increment_counter("http_requests")
        print(f"Handling request {request_id}...")
        time.sleep(0.1)  # Simulate processing
        duration = time.time() - start_time
        self.metrics.record_timer("http_request_duration", duration)


# Example Usage
if __name__ == "__main__":
    collector = MetricsCollector()
    server = WebServer(collector)

    for i in range(5):
        server.handle_request(i)

    print("\nAggregated Metrics:")
    print(collector.get_metrics())
