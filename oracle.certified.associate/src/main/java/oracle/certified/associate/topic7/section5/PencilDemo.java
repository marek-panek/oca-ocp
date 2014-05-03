package oracle.certified.associate.topic7.section5;

/**
 *  <b>| Topic 7.5 | -  <i>Use super and this to access objects and constructors.</i></b>
 *
 * @author mpanek
 */
public class PencilDemo {
    // The constructor ColorPencil() is undefined.
    // ColorPencil var1 = new ColorPencil();

    // RED cannot be resolved to a variable
    // ColorPencil var2 = new ColorPencil(RED);

    ColorPencil var3 = new ColorPencil("RED");
    Pencil var4 = new ColorPencil("BLUE");

}
