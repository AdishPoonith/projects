.class final La6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field final synthetic a:La6/h;


# direct methods
.method constructor <init>(La6/h;)V
    .locals 0

    iput-object p1, p0, La6/g;->a:La6/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, La6/g;->a:La6/h;

    invoke-static {v0}, La6/h;->E(La6/h;)Lcom/google/firebase/auth/a2;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/i;

    new-instance v0, La6/q1;

    invoke-interface {p1}, Lcom/google/firebase/auth/i;->r()Lcom/google/firebase/auth/a0;

    move-result-object v1

    check-cast v1, La6/w1;

    invoke-interface {p1}, Lcom/google/firebase/auth/i;->A()Lcom/google/firebase/auth/g;

    move-result-object p1

    check-cast p1, La6/o1;

    iget-object v2, p0, La6/g;->a:La6/h;

    invoke-static {v2}, La6/h;->E(La6/h;)Lcom/google/firebase/auth/a2;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, La6/q1;-><init>(La6/w1;La6/o1;Lcom/google/firebase/auth/a2;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    instance-of v0, p1, Lcom/google/firebase/auth/x;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/firebase/auth/x;

    iget-object v1, p0, La6/g;->a:La6/h;

    invoke-static {v1}, La6/h;->E(La6/h;)Lcom/google/firebase/auth/a2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/x;->d(Lcom/google/firebase/auth/h;)Lcom/google/firebase/auth/x;

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :cond_2
    :goto_0
    return-object p1
.end method
