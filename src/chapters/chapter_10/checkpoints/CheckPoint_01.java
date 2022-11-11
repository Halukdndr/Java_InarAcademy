package chapters.chapter_10.checkpoints;

public class CheckPoint_01 {
    /*
    No,because getLoanDate returns the reference of the private data field.
     An immutable class must not contain package-private or public data fields and setter methods
     but these are not enough to be an immutable class.There is one more requirement that
     no accessor methods can return a reference to a data field.
     */
}
