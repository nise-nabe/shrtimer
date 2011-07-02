package uwi.model;

import java.io.Serializable;
import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Link;

@Model(schemaVersion = 1)
public class Capsule implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;

    private Key ownerId;
    private Key timerId;
    @Attribute(unindexed = true)
    private Integer timerKind;
    private String title;
    
    @Attribute(unindexed = true)
    private Boolean onTitle;
    @Attribute(unindexed = true)
    private Boolean blink;
    private Link sound;
    @Attribute(unindexed = true)
    private Boolean canStop;
    private Date registeredDate;
    
    public Key getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Key ownerId) {
        this.ownerId = ownerId;
    }

    public Key getTimerId() {
        return timerId;
    }

    public void setTimerId(Key timerId) {
        this.timerId = timerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getOnTitle() {
        return onTitle;
    }

    public void setOnTitle(Boolean onTitle) {
        this.onTitle = onTitle;
    }

    public Boolean getBlink() {
        return blink;
    }

    public void setBlink(Boolean blink) {
        this.blink = blink;
    }

    public Link getSound() {
        return sound;
    }

    public void setSound(Link sound) {
        this.sound = sound;
    }

    public Boolean getCanStop() {
        return canStop;
    }

    public void setCanStop(Boolean canStop) {
        this.canStop = canStop;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getTimerKind() {
        return timerKind;
    }

    public void setTimerKind(Integer timerKind) {
        this.timerKind = timerKind;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Capsule other = (Capsule) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
}
