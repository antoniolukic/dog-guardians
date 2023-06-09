package Primavara.rest.domain;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class AgreedRequest {

    @Id
    @GeneratedValue
    private Long agreedRequestId;

    private Boolean isAgreed;

    private Timestamp agreedTimeBegin;

    private Timestamp agreedTimeEnd;

    @OneToOne(optional = true)
    @JoinColumn(name="request_guardian_id")
    private RequestGuardian requestGuardian;

    @OneToOne(optional = true)
    @JoinColumn(name="request_dog_id")
    private RequestDog requestDog;

    @ManyToOne
    @JoinColumn(name="initiator_user_id")
    private AppUser initiatorUser;

    @OneToOne
    @JoinColumn(name="user_id")
    private AppUser appUser;

    private boolean initiatorRated;

    private boolean userRated;

    public Long getAgreedRequestId() {
        return agreedRequestId;
    }

    public void setAgreedRequestId(Long agreedRequestId) {
        this.agreedRequestId = agreedRequestId;
    }

    public Boolean getAgreed() {
        return isAgreed;
    }

    public void setAgreed(Boolean agreed) {
        isAgreed = agreed;
    }

    public Timestamp getAgreedTimeBegin() {
        return agreedTimeBegin;
    }

    public void setAgreedTimeBegin(Timestamp agreedTimeBegin) {
        this.agreedTimeBegin = agreedTimeBegin;
    }

    public Timestamp getAgreedTimeEnd() {
        return agreedTimeEnd;
    }

    public void setAgreedTimeEnd(Timestamp agreedTimeEnd) {
        this.agreedTimeEnd = agreedTimeEnd;
    }

    public RequestGuardian getRequestGuardian() {
        return requestGuardian;
    }

    public void setRequestGuardian(RequestGuardian requestGuardian) {
        this.requestGuardian = requestGuardian;
    }

    public RequestDog getRequestDog() {
        return requestDog;
    }

    public void setRequestDog(RequestDog requestDog) {
        this.requestDog = requestDog;
    }

    public AppUser getInitiatorUser() {
        return initiatorUser;
    }

    public void setInitiatorUser(AppUser initiatorUser) {
        this.initiatorUser = initiatorUser;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public boolean isInitiatorRated() {
        return initiatorRated;
    }

    public void setInitiatorRated(boolean initiatorRated) {
        this.initiatorRated = initiatorRated;
    }

    public boolean isUserRated() {
        return userRated;
    }

    public void setUserRated(boolean userRated) {
        this.userRated = userRated;
    }
}
