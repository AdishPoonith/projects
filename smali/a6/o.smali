.class final La6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final j:Ljava/lang/String;

.field final synthetic k:La6/p;


# direct methods
.method constructor <init>(La6/p;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La6/o;->k:La6/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La6/o;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, La6/o;->j:Ljava/lang/String;

    invoke-static {v0}, Lw5/f;->p(Ljava/lang/String;)Lw5/f;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lw5/f;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->m()Lcom/google/firebase/auth/a0;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->d(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-static {}, La6/p;->a()Lf4/a;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Token refreshing started"

    invoke-virtual {v1, v3, v2}, Lf4/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, La6/n;

    invoke-direct {v1, p0}, La6/n;-><init>(La6/o;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method
