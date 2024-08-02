package com.Q_preap;

public class NestedClass {
    class OuterClass {
        static int outerStatic = 10;
        int outerNonStatic = 20;

        // Static Nested Class
        static class StaticNestedClass {
            void display() {
                System.out.println("Outer static variable: " + outerStatic);
            }
        }

        // Inner Class
        class InnerClass {
            void display() {
                System.out.println("Outer static variable: " + outerStatic);
                System.out.println("Outer non-static variable: " + outerNonStatic);
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Creating an instance of the static nested class
            OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
            staticNested.display();

            // Creating an instance of the inner class
            //OuterClass outer = new OuterClass();
           // OuterClass.InnerClass inner = outer.new InnerClass();
           // inner.display();
        }
    }

}
