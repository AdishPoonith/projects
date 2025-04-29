.class public final Lcom/google/android/gms/internal/firebase-auth-api/dm;
.super Lcom/google/android/gms/internal/firebase-auth-api/hj;
.source "SourceFile"


# static fields
.field private static final d:Lcom/google/android/gms/internal/firebase-auth-api/ek;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zl;->a:Lcom/google/android/gms/internal/firebase-auth-api/zl;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/yl;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/rl;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ek;->b(Lcom/google/android/gms/internal/firebase-auth-api/ck;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/ek;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/dm;->d:Lcom/google/android/gms/internal/firebase-auth-api/ek;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/fk;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/bm;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/ta;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/bm;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/vq;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/fk;)V

    return-void
.end method

.method static bridge synthetic k(Lcom/google/android/gms/internal/firebase-auth-api/br;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/dm;->o(Lcom/google/android/gms/internal/firebase-auth-api/br;)V

    return-void
.end method

.method public static l(Z)V
    .locals 1

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/dm;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/dm;-><init>()V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    sget p0, Lcom/google/android/gms/internal/firebase-auth-api/om;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->b()Lcom/google/android/gms/internal/firebase-auth-api/rj;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/om;->a(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/qj;->a()Lcom/google/android/gms/internal/firebase-auth-api/qj;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/dm;->d:Lcom/google/android/gms/internal/firebase-auth-api/ek;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/qj;->e(Lcom/google/android/gms/internal/firebase-auth-api/ek;)V

    return-void
.end method

.method public static final m(Lcom/google/android/gms/internal/firebase-auth-api/vq;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/vq;->C()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->c(II)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/vq;->I()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/vq;->H()Lcom/google/android/gms/internal/firebase-auth-api/br;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/dm;->o(Lcom/google/android/gms/internal/firebase-auth-api/br;)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static bridge synthetic n(IIII)Lcom/google/android/gms/internal/firebase-auth-api/fj;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/fj;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yq;->D()Lcom/google/android/gms/internal/firebase-auth-api/xq;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/br;->D()Lcom/google/android/gms/internal/firebase-auth-api/ar;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/ar;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/ar;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ar;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/ar;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/br;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/xq;->s(Lcom/google/android/gms/internal/firebase-auth-api/br;)Lcom/google/android/gms/internal/firebase-auth-api/xq;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/xq;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/xq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/yq;

    invoke-direct {v0, p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/fj;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static o(Lcom/google/android/gms/internal/firebase-auth-api/br;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/br;->C()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/br;->H()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    const/4 v1, 0x1

    const-string v2, "tag size too big"

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/br;->C()I

    move-result p0

    const/16 v0, 0x1c

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/br;->C()I

    move-result p0

    const/16 v0, 0x40

    if-gt p0, v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/br;->C()I

    move-result p0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/br;->C()I

    move-result p0

    const/16 v0, 0x30

    if-gt p0, v0, :cond_7

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/br;->C()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_9

    :goto_0
    return-void

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too small"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/gj;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/yq;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/cm;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cm;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/dm;Ljava/lang/Class;)V

    return-object v1
.end method

.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/ur;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->l:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    return-object v0
.end method

.method public final synthetic c(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/vq;->G(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/vq;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/vq;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/dm;->m(Lcom/google/android/gms/internal/firebase-auth-api/vq;)V

    return-void
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
