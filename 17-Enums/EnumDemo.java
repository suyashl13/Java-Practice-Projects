enum Status {
    PENDING, APPROVED, REJECTED
}

enum Priority {
    HIGH, MEDIUM, LOW;

    private Priority() {
        System.out.println("Constructor called for: " + this.toString());
    }
}

enum ApprovalType {
    LEAVE, SALARY, BONUS
}

class Approval {
    private Status status;
    private Priority priority;
    private ApprovalType approvalType;
    private String comment;

    public Approval(Status status, Priority priority, ApprovalType approvalType) {
        this.status = status;
        this.priority = priority;
        this.approvalType = approvalType;
    }

    public Approval(Status status, Priority priority, ApprovalType approvalType, String comment) {
        this.status = status;
        this.priority = priority;
        this.approvalType = approvalType;
        this.comment = comment;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public ApprovalType getApprovalType() {
        return approvalType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

public class EnumDemo {

    public static void main(String[] args) {
        Approval approval = new Approval(Status.PENDING, Priority.HIGH, ApprovalType.LEAVE);
        System.out.println("Approval Status: " + approval.getStatus());
        System.out.println("Approval Priority: " + approval.getPriority());
        System.out.println("Approval Type: " + approval.getApprovalType());

        Approval approval2 = new Approval(Status.APPROVED, Priority.LOW, ApprovalType.SALARY, "Approved by HR");
        System.out.println("Approval Status: " + approval2.getStatus());
        System.out.println("Approval Priority: " + approval2.getPriority());
        System.out.println("Approval Type: " + approval2.getApprovalType());
        System.out.println("Approval Comment: " + approval2.getComment());

        switch (approval2.getStatus()) {
            case PENDING:
                System.out.println("Approval is Pending for " + approval2.getApprovalType());
                break;
        
            case APPROVED:
                System.out.println("Approval is Approved for " + approval2.getApprovalType());
                break;
            
            case REJECTED:
                System.out.println("Approval is Rejected for " + approval2.getApprovalType());
                break;

            default:
                break;
        }
    }
}