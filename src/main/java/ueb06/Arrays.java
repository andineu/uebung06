package ueb06;

class Arrays {
	/**
	 * Gibt eine Stringrepraesentation des Arrays zurueck, z.B. [] oder [1, 2, 3]
	 */
	static <T> String toString(T[] array) {
		if (array == null) {
			return "[]";
		} else if (array.length == 0) {
		    return "[]";
        }else {
		    return toString(array, 0, "[");
		}
	}

    static <T> String toString(T[] array, int count, String s) {
	    if (count == array.length-1) {
	        return s + array[count] + "]";
        } else {
            s = s + array[count] + ", ";
            return toString(array, count+1, s);
        }
    }



    /**
	 * Gib zurück, ob ein Objekt in dem Array enthalten ist; verwendet `equals`
	 */
	static <T> boolean contains(T[] array, T object) {
	    if (array == null) {
	        return false;
        } else {
	        return contains(array, object, 0);
        }
	}

    static <T> boolean contains(T[] array, T object, int count) {
	    if (array.length <= count) {
	        return false;
        }
	    if (array[count] == object){
	        return true;
        }else {
	        return contains(array, object, count +1);
        }
    }
}
