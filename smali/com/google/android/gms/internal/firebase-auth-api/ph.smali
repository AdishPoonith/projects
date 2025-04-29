.class final Lcom/google/android/gms/internal/firebase-auth-api/ph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/wt;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private c:Lcom/google/android/gms/internal/firebase-auth-api/uo;

.field private d:Lcom/google/android/gms/internal/firebase-auth-api/vn;

.field private e:I

.field private f:Lcom/google/android/gms/internal/firebase-auth-api/hp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/as;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/as;->H()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->a:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/jb;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/as;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/xo;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/xo;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->c(Lcom/google/android/gms/internal/firebase-auth-api/as;)Lcom/google/android/gms/internal/firebase-auth-api/w6;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/uo;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->c:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xo;->C()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->b:I
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "invalid KeyFormat protobuf, expected AesGcmKeyFormat"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/jb;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat"

    if-eqz v1, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/as;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->E(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/yn;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->c(Lcom/google/android/gms/internal/firebase-auth-api/as;)Lcom/google/android/gms/internal/firebase-auth-api/w6;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/vn;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->d:Lcom/google/android/gms/internal/firebase-auth-api/vn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->F()Lcom/google/android/gms/internal/firebase-auth-api/fo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fo;->C()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->e:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->G()Lcom/google/android/gms/internal/firebase-auth-api/yq;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yq;->C()I

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->b:I
    :try_end_1
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/yg;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :try_start_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/as;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/kp;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/kp;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->c(Lcom/google/android/gms/internal/firebase-auth-api/as;)Lcom/google/android/gms/internal/firebase-auth-api/w6;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/hp;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->f:Lcom/google/android/gms/internal/firebase-auth-api/hp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/kp;->C()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->b:I
    :try_end_2
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "unsupported AEAD DEM key type: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a([B)Lcom/google/android/gms/internal/firebase-auth-api/li;
    .locals 5

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/s9;

    array-length v1, p1

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->b:I

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->a:Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/jb;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->D()Lcom/google/android/gms/internal/firebase-auth-api/to;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->c:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->i(Lcom/google/android/gms/internal/firebase-auth-api/r5;)Lcom/google/android/gms/internal/firebase-auth-api/o5;

    iget v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->b:I

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/to;->r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/to;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/uo;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/li;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->a:Ljava/lang/String;

    invoke-static {v2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->f(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/s9;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/li;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/s9;)V

    return-object v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->a:Ljava/lang/String;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/jb;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->e:I

    invoke-static {p1, v2, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->e:I

    iget v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->b:I

    invoke-static {p1, v3, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->D()Lcom/google/android/gms/internal/firebase-auth-api/ao;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->d:Lcom/google/android/gms/internal/firebase-auth-api/vn;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->G()Lcom/google/android/gms/internal/firebase-auth-api/bo;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->i(Lcom/google/android/gms/internal/firebase-auth-api/r5;)Lcom/google/android/gms/internal/firebase-auth-api/o5;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    array-length v4, v1

    invoke-static {v1, v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ao;->r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/ao;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/bo;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/vq;->D()Lcom/google/android/gms/internal/firebase-auth-api/uq;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->d:Lcom/google/android/gms/internal/firebase-auth-api/vn;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->H()Lcom/google/android/gms/internal/firebase-auth-api/vq;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->i(Lcom/google/android/gms/internal/firebase-auth-api/r5;)Lcom/google/android/gms/internal/firebase-auth-api/o5;

    array-length v4, p1

    invoke-static {p1, v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/uq;->r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/uq;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/vq;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->D()Lcom/google/android/gms/internal/firebase-auth-api/un;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->d:Lcom/google/android/gms/internal/firebase-auth-api/vn;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->C()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/un;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/un;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/un;->r(Lcom/google/android/gms/internal/firebase-auth-api/bo;)Lcom/google/android/gms/internal/firebase-auth-api/un;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/un;->s(Lcom/google/android/gms/internal/firebase-auth-api/vq;)Lcom/google/android/gms/internal/firebase-auth-api/un;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/vn;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/li;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->a:Ljava/lang/String;

    invoke-static {v2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->f(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/s9;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/li;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/s9;)V

    return-object v1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->a:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/yg;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/hp;->D()Lcom/google/android/gms/internal/firebase-auth-api/gp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->f:Lcom/google/android/gms/internal/firebase-auth-api/hp;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->i(Lcom/google/android/gms/internal/firebase-auth-api/r5;)Lcom/google/android/gms/internal/firebase-auth-api/o5;

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->b:I

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gp;->r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/gp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/hp;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/li;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->a:Ljava/lang/String;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/x9;

    invoke-static {v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->f(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/x9;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/li;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/x9;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown DEM key type"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Symmetric key has incorrect length"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ph;->b:I

    return v0
.end method
