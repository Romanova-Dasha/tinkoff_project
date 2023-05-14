package ru.tinkoff.edu.java.scrapper.domain.jooq.tables.pojos;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.17.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String url;
    private LocalDateTime checkedAt;
    private LocalDateTime ghPushedAt;
    private String ghDescription;
    private Integer ghForksCount;
    private Integer soAnswerCount;
    private LocalDateTime soLastEditDate;

    public Link() {}

    public Link(Link value) {
        this.id = value.id;
        this.url = value.url;
        this.checkedAt = value.checkedAt;
        this.ghPushedAt = value.ghPushedAt;
        this.ghDescription = value.ghDescription;
        this.ghForksCount = value.ghForksCount;
        this.soAnswerCount = value.soAnswerCount;
        this.soLastEditDate = value.soLastEditDate;
    }

    @ConstructorProperties({ "id", "url", "checkedAt", "ghPushedAt", "ghDescription", "ghForksCount", "soAnswerCount", "soLastEditDate" })
    public Link(
        @NotNull Long id,
        @NotNull String url,
        @NotNull LocalDateTime checkedAt,
        @Nullable LocalDateTime ghPushedAt,
        @Nullable String ghDescription,
        @Nullable Integer ghForksCount,
        @Nullable Integer soAnswerCount,
        @Nullable LocalDateTime soLastEditDate
    ) {
        this.id = id;
        this.url = url;
        this.checkedAt = checkedAt;
        this.ghPushedAt = ghPushedAt;
        this.ghDescription = ghDescription;
        this.ghForksCount = ghForksCount;
        this.soAnswerCount = soAnswerCount;
        this.soLastEditDate = soLastEditDate;
    }

    /**
     * Getter for <code>link.ID</code>.
     */
    @NotNull
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>link.ID</code>.
     */
    public void setId(@NotNull Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>link.URL</code>.
     */
    @jakarta.validation.constraints.NotNull
    @Size(max = 1000000000)
    @NotNull
    public String getUrl() {
        return this.url;
    }

    /**
     * Setter for <code>link.URL</code>.
     */
    public void setUrl(@NotNull String url) {
        this.url = url;
    }

    /**
     * Getter for <code>link.CHECKED_AT</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public LocalDateTime getCheckedAt() {
        return this.checkedAt;
    }

    /**
     * Setter for <code>link.CHECKED_AT</code>.
     */
    public void setCheckedAt(@NotNull LocalDateTime checkedAt) {
        this.checkedAt = checkedAt;
    }

    /**
     * Getter for <code>link.GH_PUSHED_AT</code>.
     */
    @Nullable
    public LocalDateTime getGhPushedAt() {
        return this.ghPushedAt;
    }

    /**
     * Setter for <code>link.GH_PUSHED_AT</code>.
     */
    public void setGhPushedAt(@Nullable LocalDateTime ghPushedAt) {
        this.ghPushedAt = ghPushedAt;
    }

    /**
     * Getter for <code>link.GH_DESCRIPTION</code>.
     */
    @Size(max = 1000000000)
    @Nullable
    public String getGhDescription() {
        return this.ghDescription;
    }

    /**
     * Setter for <code>link.GH_DESCRIPTION</code>.
     */
    public void setGhDescription(@Nullable String ghDescription) {
        this.ghDescription = ghDescription;
    }

    /**
     * Getter for <code>link.GH_FORKS_COUNT</code>.
     */
    @Nullable
    public Integer getGhForksCount() {
        return this.ghForksCount;
    }

    /**
     * Setter for <code>link.GH_FORKS_COUNT</code>.
     */
    public void setGhForksCount(@Nullable Integer ghForksCount) {
        this.ghForksCount = ghForksCount;
    }

    /**
     * Getter for <code>link.SO_ANSWER_COUNT</code>.
     */
    @Nullable
    public Integer getSoAnswerCount() {
        return this.soAnswerCount;
    }

    /**
     * Setter for <code>link.SO_ANSWER_COUNT</code>.
     */
    public void setSoAnswerCount(@Nullable Integer soAnswerCount) {
        this.soAnswerCount = soAnswerCount;
    }

    /**
     * Getter for <code>link.SO_LAST_EDIT_DATE</code>.
     */
    @Nullable
    public LocalDateTime getSoLastEditDate() {
        return this.soLastEditDate;
    }

    /**
     * Setter for <code>link.SO_LAST_EDIT_DATE</code>.
     */
    public void setSoLastEditDate(@Nullable LocalDateTime soLastEditDate) {
        this.soLastEditDate = soLastEditDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Link other = (Link) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.url == null) {
            if (other.url != null)
                return false;
        }
        else if (!this.url.equals(other.url))
            return false;
        if (this.checkedAt == null) {
            if (other.checkedAt != null)
                return false;
        }
        else if (!this.checkedAt.equals(other.checkedAt))
            return false;
        if (this.ghPushedAt == null) {
            if (other.ghPushedAt != null)
                return false;
        }
        else if (!this.ghPushedAt.equals(other.ghPushedAt))
            return false;
        if (this.ghDescription == null) {
            if (other.ghDescription != null)
                return false;
        }
        else if (!this.ghDescription.equals(other.ghDescription))
            return false;
        if (this.ghForksCount == null) {
            if (other.ghForksCount != null)
                return false;
        }
        else if (!this.ghForksCount.equals(other.ghForksCount))
            return false;
        if (this.soAnswerCount == null) {
            if (other.soAnswerCount != null)
                return false;
        }
        else if (!this.soAnswerCount.equals(other.soAnswerCount))
            return false;
        if (this.soLastEditDate == null) {
            if (other.soLastEditDate != null)
                return false;
        }
        else if (!this.soLastEditDate.equals(other.soLastEditDate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.url == null) ? 0 : this.url.hashCode());
        result = prime * result + ((this.checkedAt == null) ? 0 : this.checkedAt.hashCode());
        result = prime * result + ((this.ghPushedAt == null) ? 0 : this.ghPushedAt.hashCode());
        result = prime * result + ((this.ghDescription == null) ? 0 : this.ghDescription.hashCode());
        result = prime * result + ((this.ghForksCount == null) ? 0 : this.ghForksCount.hashCode());
        result = prime * result + ((this.soAnswerCount == null) ? 0 : this.soAnswerCount.hashCode());
        result = prime * result + ((this.soLastEditDate == null) ? 0 : this.soLastEditDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Link (");

        sb.append(id);
        sb.append(", ").append(url);
        sb.append(", ").append(checkedAt);
        sb.append(", ").append(ghPushedAt);
        sb.append(", ").append(ghDescription);
        sb.append(", ").append(ghForksCount);
        sb.append(", ").append(soAnswerCount);
        sb.append(", ").append(soLastEditDate);

        sb.append(")");
        return sb.toString();
    }
}