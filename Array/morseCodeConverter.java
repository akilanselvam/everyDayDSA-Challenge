class Solution {
  public int uniqueMorseRepresentations(String[] words) {

    HashMap < Character, String > morseMapping = new HashMap < > ();

    morseMapping.put('a', ".-");
    morseMapping.put('b', "-...");
    morseMapping.put('c', "-.-.");
    morseMapping.put('d', "-..");
    morseMapping.put('e', ".");
    morseMapping.put('f', "..-.");
    morseMapping.put('g', "--.");
    morseMapping.put('h', "....");
    morseMapping.put('i', "..");
    morseMapping.put('j', ".---");
    morseMapping.put('k', "-.-");
    morseMapping.put('l', ".-..");
    morseMapping.put('m', "--");
    morseMapping.put('n', "-.");
    morseMapping.put('o', "---");
    morseMapping.put('p', ".--.");
    morseMapping.put('q', "--.-");
    morseMapping.put('r', ".-.");
    morseMapping.put('s', "...");
    morseMapping.put('t', "-");
    morseMapping.put('u', "..-");
    morseMapping.put('v', "...-");
    morseMapping.put('w', ".--");
    morseMapping.put('x', "-..-");
    morseMapping.put('y', "-.--");
    morseMapping.put('z', "--..");

    HashSet < String > uniqueTransformations = new HashSet < > ();

    for (String word: words) {
      StringBuilder mC = new StringBuilder();
      for (char string: word.toCharArray()) {
        if (morseMapping.containsKey(Character.toLowerCase(string))) {
          mC.append(morseMapping.get(Character.toLowerCase(string)));
        }
      }
      uniqueTransformations.add(mC.toString());
    }

    return uniqueTransformations.size();
  }
}
