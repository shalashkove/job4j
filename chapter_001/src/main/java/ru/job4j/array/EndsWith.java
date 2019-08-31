package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class EndsWith {

    /**
     * Проверяет. что слово заканчивается на постфиксом.
     * @param post префикс.
     * @return если слово заканчивается постфиксом
     */
    public boolean endsWith(String word, String post) {
        boolean result = true;
        char[] pst = post.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = 0; i != pst.length - 1; i++) {
            if (pst[pst.length - 1 - i] != wrd[wrd.length - 1 - i]) {
                result = false;
            }
        }
        return result;
    }
}
