.class Lu8/f1$a;
.super Lcom/google/firebase/auth/q0$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu8/f1;->b(Ljava/lang/Object;Lr8/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lu8/f1;


# direct methods
.method constructor <init>(Lu8/f1;)V
    .locals 0

    iput-object p1, p0, Lu8/f1$a;->b:Lu8/f1;

    invoke-direct {p0}, Lcom/google/firebase/auth/q0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "verificationId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "name"

    const-string v1, "Auth#phoneCodeAutoRetrievalTimeout"

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lu8/f1$a;->b:Lu8/f1;

    invoke-static {p1}, Lu8/f1;->a(Lu8/f1;)Lr8/d$b;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu8/f1$a;->b:Lu8/f1;

    invoke-static {p1}, Lu8/f1;->a(Lu8/f1;)Lr8/d$b;

    move-result-object p1

    invoke-interface {p1, v0}, Lr8/d$b;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Lcom/google/firebase/auth/q0$a;)V
    .locals 3

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {}, Lu8/f1;->d()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v1, "verificationId"

    invoke-interface {p2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "forceResendingToken"

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "name"

    const-string v0, "Auth#phoneCodeSent"

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lu8/f1$a;->b:Lu8/f1;

    invoke-static {p1}, Lu8/f1;->a(Lu8/f1;)Lr8/d$b;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu8/f1$a;->b:Lu8/f1;

    invoke-static {p1}, Lu8/f1;->a(Lu8/f1;)Lr8/d$b;

    move-result-object p1

    invoke-interface {p1, p2}, Lr8/d$b;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public c(Lcom/google/firebase/auth/o0;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lu8/f1$a;->b:Lu8/f1;

    iget-object v1, v1, Lu8/f1;->f:Lu8/f1$b;

    invoke-interface {v1, p1}, Lu8/f1$b;->a(Lcom/google/firebase/auth/o0;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "token"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->E()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->E()Ljava/lang/String;

    move-result-object p1

    const-string v0, "smsCode"

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string p1, "name"

    const-string v0, "Auth#phoneVerificationCompleted"

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lu8/f1$a;->b:Lu8/f1;

    invoke-static {p1}, Lu8/f1;->a(Lu8/f1;)Lr8/d$b;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu8/f1$a;->b:Lu8/f1;

    invoke-static {p1}, Lu8/f1;->a(Lu8/f1;)Lr8/d$b;

    move-result-object p1

    invoke-interface {p1, v1}, Lr8/d$b;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public d(Lw5/l;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "message"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lu8/t0;->q0(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "details"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v1, "error"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "name"

    const-string v1, "Auth#phoneVerificationFailed"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu8/f1$a;->b:Lu8/f1;

    invoke-static {v0}, Lu8/f1;->a(Lu8/f1;)Lr8/d$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu8/f1$a;->b:Lu8/f1;

    invoke-static {v0}, Lu8/f1;->a(Lu8/f1;)Lr8/d$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lr8/d$b;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
