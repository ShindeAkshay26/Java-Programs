interface methods
{
    void meth1();
    void meth2();
}

interface methods1 extends methods
{
    void meth3();
    void meth4();

}

class overall_methods implements methods1
{
    @Override
    public void meth1() {
        System.out.println("Here we are accessing a meth1 through the inheritance inteface");
    }

    @Override
    public void meth2() {
        System.out.println("Here we are accessing a meth2 through the inheritance inteface");
    }

    @Override
    public void meth3() {
        System.out.println("Here we are accessing a meth3 through the inheritance inteface");
    }

    @Override
    public void meth4() {
        System.out.println("Here we are accessing a meth4 through the inheritance inteface");
    }
}

class inheritance_interface
{
    public static void main(String[] args) {
        System.out.println("Inheritance through the interface in JAVA");

        overall_methods om=new overall_methods();
        om.meth1();
        om.meth2();
        om.meth3();
        om.meth4();

    }
}