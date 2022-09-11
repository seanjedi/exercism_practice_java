class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaner = new StringBuilder(identifier.toString());
        for (int i = 0; i < cleaner.length(); i++) {
            if (Character.isISOControl(cleaner.charAt(i))) {
                cleaner.deleteCharAt(i).insert(i, "CTRL");
            } else if (Character.isWhitespace(cleaner.charAt(i))) {
                cleaner.setCharAt(i, '_');
            } else if (Character.compare('-', cleaner.charAt(i)) == 0) {
                cleaner.deleteCharAt(i);
                if (!Character.isLetter(cleaner.charAt(i))) {
                    cleaner.deleteCharAt(i);
                } else {
                    cleaner.setCharAt(i, Character.toUpperCase(cleaner.charAt(i)));
                }
            } else if (!Character.isLetter(cleaner.charAt(i))) {
                cleaner.deleteCharAt(i);
                i -= 1;
            }
        }
        return (cleaner.toString().replaceAll("[α-ω]", ""));
    }
}
