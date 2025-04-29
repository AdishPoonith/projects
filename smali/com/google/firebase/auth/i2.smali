.class final Lcom/google/firebase/auth/i2;
.super Lcom/google/firebase/auth/q0$b;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/google/firebase/auth/p0;

.field final synthetic c:Lcom/google/firebase/auth/q0$b;

.field final synthetic d:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/p0;Lcom/google/firebase/auth/q0$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/i2;->d:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p2, p0, Lcom/google/firebase/auth/i2;->b:Lcom/google/firebase/auth/p0;

    iput-object p3, p0, Lcom/google/firebase/auth/i2;->c:Lcom/google/firebase/auth/q0$b;

    invoke-direct {p0}, Lcom/google/firebase/auth/q0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/i2;->c:Lcom/google/firebase/auth/q0$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/q0$b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/google/firebase/auth/q0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/i2;->c:Lcom/google/firebase/auth/q0$b;

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/auth/q0$b;->b(Ljava/lang/String;Lcom/google/firebase/auth/q0$a;)V

    return-void
.end method

.method public final c(Lcom/google/firebase/auth/o0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/i2;->c:Lcom/google/firebase/auth/q0$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/q0$b;->c(Lcom/google/firebase/auth/o0;)V

    return-void
.end method

.method public final d(Lw5/l;)V
    .locals 5

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/i;->b:I

    instance-of v0, p1, Lcom/google/firebase/auth/q;

    const-string v1, "FirebaseAuth"

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/firebase/auth/q;

    invoke-virtual {v0}, Lcom/google/firebase/auth/q;->a()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/firebase/auth/i2;->b:Lcom/google/firebase/auth/p0;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/firebase/auth/p0;->j(Z)V

    iget-object p1, p0, Lcom/google/firebase/auth/i2;->b:Lcom/google/firebase/auth/p0;

    invoke-virtual {p1}, Lcom/google/firebase/auth/p0;->h()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Re-triggering phone verification with Recaptcha flow forced for phone number "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/google/firebase/auth/i2;->d:Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v0, p0, Lcom/google/firebase/auth/i2;->b:Lcom/google/firebase/auth/p0;

    invoke-virtual {p1, v0}, Lcom/google/firebase/auth/FirebaseAuth;->a0(Lcom/google/firebase/auth/p0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/i2;->b:Lcom/google/firebase/auth/p0;

    invoke-virtual {v0}, Lcom/google/firebase/auth/p0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invoking original failure callbacks after phone verification failure for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", error - "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/firebase/auth/i2;->c:Lcom/google/firebase/auth/q0$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/q0$b;->d(Lw5/l;)V

    return-void
.end method
