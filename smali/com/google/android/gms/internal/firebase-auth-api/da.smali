.class Lcom/google/android/gms/internal/firebase-auth-api/da;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/ba;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

.field private final b:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/hj;Ljava/lang/Class;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->j()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljava/lang/Void;

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const/4 p1, 0x1

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, p1

    const-string p1, "Given internalKeyMananger %s does not support primitive class %s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->b:Ljava/lang/Class;

    return-void
.end method

.method private final f()Lcom/google/android/gms/internal/firebase-auth-api/ca;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ca;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->a()Lcom/google/android/gms/internal/firebase-auth-api/gj;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ca;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/gj;)V

    return-object v0
.end method

.method private final g(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Ljava/lang/Object;
    .locals 2

    const-class v0, Ljava/lang/Void;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->b:Ljava/lang/Class;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->i(Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Cannot create a primitive for Void"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 3

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/da;->f()Lcom/google/android/gms/internal/firebase-auth-api/ca;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ca;->a(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->a()Lcom/google/android/gms/internal/firebase-auth-api/gj;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/gj;->e()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failures parsing proto of type "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/vr;
    .locals 2

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/da;->f()Lcom/google/android/gms/internal/firebase-auth-api/ca;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ca;->a(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->C()Lcom/google/android/gms/internal/firebase-auth-api/sr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sr;->s(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/sr;

    invoke-interface {p1}, Lcom/google/android/gms/internal/firebase-auth-api/w6;->zzo()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/sr;->t(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/sr;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->b()Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/sr;->r(Lcom/google/android/gms/internal/firebase-auth-api/ur;)Lcom/google/android/gms/internal/firebase-auth-api/sr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/vr;
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Unexpected proto"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final d(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->h()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->h()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/da;->g(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Expected proto of type "

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->c(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/da;->g(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->h()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failures parsing proto of type "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/da;->a:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
