class Ex3_11 {

    public static void main(String[] args) {

        int PRINTABLE = 1;

        int EDITABLE = 2;

        int VISIBLE = 4;

        int document = 0;

        document = document | PRINTABLE | VISIBLE;

        System.out.println("Document is " + ((document & PRINTABLE) == PRINTABLE ? "Printable" : "Not Printable"));

        System.out.println("Document is " + ((document & EDITABLE) == EDITABLE ? "Editable" : "Not Editable"));

        System.out.println("Document is " + ((document & VISIBLE) == VISIBLE ? "Visible" : "Not Visible"));

    }

}
