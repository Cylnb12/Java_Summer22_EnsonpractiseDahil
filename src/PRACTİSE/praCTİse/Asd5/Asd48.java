package Asd5;

public class Asd48 {

    public class Test06 {
        public  void main(String[] args) {
            new C().create();
            new D().update();
            new R().read();
            new D().delete();
            new R().create();
        }}
    class C{
        public  void  create() {
            System.out.println("c");
        }}
    class U {
        private void update() {
            System.out.println("u");
        }}
    class R extends C{
        public  void create(){
            System.out.println("C");
        }
        protected void read(){
            System.out.println("R");
        }}
    class D extends U{
        void update(){
            System.out.println("U");
        }
        void delete(){
            System.out.println("D");
        }
    }



}
