package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String username;
    private Date entry;

    public LogEntry(String username, Date entry) {
        this.username = username;
        this.entry = entry;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getEntry() {
        return entry;
    }

    public void setEntry(Date entry) {
        this.entry = entry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(username, logEntry.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "username='" + username + '\'' +
                ", entry=" + entry +
                '}';
    }
}
