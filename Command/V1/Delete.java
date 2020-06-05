public class Delete extends CommandIF {
    int position;
   Delete(int position) {
       this.position = position;
   } 
   void execute(StringBuffer buffer) {
    buffer.deleteCharAt(position);
   }
}