import java.util.*;

public class TwotterSystem {
    List<User> users = new ArrayList<>();
    // Alternativ: Username (String) als key
    Map<User, List<Message>> userMessages = new HashMap<>();

    public void addMessage(User u, Message m) {
        if (m.getMessage().length() > 140)
            throw new RuntimeException("Zu lang!");

        if (!users.contains(u))
            users.add(u);

        // Prüfe, ob dem Nutzer schon eine Liste zugeordnet wurde
        if (!userMessages.containsKey(u))
            userMessages.put(u, new ArrayList<>());

        // Hole die Liste und schreibe die Message
        List<Message> messages = userMessages.get(u);
        messages.add(m);

        // Verknüpfe die Message mit dem User
        m.setAuthor(u);
    }

    // Map<User, List<Message>> userMessages = new HashMap<>();
    public List<Message> getAllMessages() {
        List<Message> result = new ArrayList<>();

        Collection<List<Message>> map = userMessages.values();
        for (List<Message> list : map) {
            for (Message message : list) {
                result.add(message);
            }
            // Alternativ:
            // result.addAll(list);
        }

        return result;
    }

    public List<Message> getAllMessagesFromUser(User u) {
        List<Message> result = new ArrayList<>();

        List<Message> allMessages = getAllMessages();
        for (Message message : allMessages) {
            if (message.getAuthor().equals(u))
                result.add(message);
        }

        return result;
    }

    /**
     * Alternative:
     * public List<Message> getAllMessagesFromUser(User u) {
     * List<Message> allMessages = getAllMessages();
     * return allMessages
     * .stream()
     * .filter(message -> message.getAuthor() == u)
     * .collect(Collectors.toList());
     * }
     **/


    public List<Message> getAllMessagesFromDate(String u) {
        List<Message> result = new ArrayList<>();

        List<Message> allMessages = getAllMessages();
        for (Message message : allMessages) {
            if (message.getCreationDate().equals(u))
                result.add(message);
        }

        return result;
    }
}
