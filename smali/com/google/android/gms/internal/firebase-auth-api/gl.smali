.class public final Lcom/google/android/gms/internal/firebase-auth-api/gl;
.super Lcom/google/android/gms/internal/firebase-auth-api/hj;
.source "SourceFile"


# static fields
.field private static final d:Lcom/google/android/gms/internal/firebase-auth-api/ek;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/dl;->a:Lcom/google/android/gms/internal/firebase-auth-api/dl;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/cl;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/rl;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ek;->b(Lcom/google/android/gms/internal/firebase-auth-api/ck;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/ek;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/gl;->d:Lcom/google/android/gms/internal/firebase-auth-api/ek;

    return-void
.end method

.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/fk;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/el;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/ta;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/el;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/mn;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/fk;)V

    return-void
.end method

.method static bridge synthetic k(Lcom/google/android/gms/internal/firebase-auth-api/sn;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/gl;->n(Lcom/google/android/gms/internal/firebase-auth-api/sn;)V

    return-void
.end method

.method static bridge synthetic l(I)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/gl;->o(I)V

    return-void
.end method

.method public static m(Z)V
    .locals 1

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/gl;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/gl;-><init>()V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    sget p0, Lcom/google/android/gms/internal/firebase-auth-api/ql;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->b()Lcom/google/android/gms/internal/firebase-auth-api/rj;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ql;->a(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/qj;->a()Lcom/google/android/gms/internal/firebase-auth-api/qj;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/gl;->d:Lcom/google/android/gms/internal/firebase-auth-api/ek;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/qj;->e(Lcom/google/android/gms/internal/firebase-auth-api/ek;)V

    return-void
.end method

.method private static n(Lcom/google/android/gms/internal/firebase-auth-api/sn;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/sn;->C()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/sn;->C()I

    move-result p0

    const/16 v0, 0x10

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too long"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too short"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static o(I)V
    .locals 1

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/gj;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/pn;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/fl;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fl;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/gl;Ljava/lang/Class;)V

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

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mn;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/mn;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/mn;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mn;->C()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->c(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mn;->H()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/gl;->o(I)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mn;->G()Lcom/google/android/gms/internal/firebase-auth-api/sn;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gl;->n(Lcom/google/android/gms/internal/firebase-auth-api/sn;)V

    return-void
.end method
