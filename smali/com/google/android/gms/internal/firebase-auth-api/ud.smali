.class public final synthetic Lcom/google/android/gms/internal/firebase-auth-api/ud;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/yi;


# static fields
.field public static final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/ud;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ud;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ud;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ud;->a:Lcom/google/android/gms/internal/firebase-auth-api/ud;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/firebase-auth-api/ok;Lcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/aa;
    .locals 6

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/vd;->f:I

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :try_start_0
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->d()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/uo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->C()I

    move-result v1

    if-nez v1, :cond_4

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/md;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/md;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ld;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/md;->b(I)Lcom/google/android/gms/internal/firebase-auth-api/md;

    const/16 v3, 0xc

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/md;->a(I)Lcom/google/android/gms/internal/firebase-auth-api/md;

    const/16 v3, 0x10

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/md;->c(I)Lcom/google/android/gms/internal/firebase-auth-api/md;

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->c()Lcom/google/android/gms/internal/firebase-auth-api/ct;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/ct;->k:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    const/4 v5, 0x4

    if-ne v4, v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/ct;->zza()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to parse OutputPrefixType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/nd;->d:Lcom/google/android/gms/internal/firebase-auth-api/nd;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/nd;->c:Lcom/google/android/gms/internal/firebase-auth-api/nd;

    goto :goto_1

    :cond_3
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/nd;->b:Lcom/google/android/gms/internal/firebase-auth-api/nd;

    :goto_1
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/md;->d(Lcom/google/android/gms/internal/firebase-auth-api/nd;)Lcom/google/android/gms/internal/firebase-auth-api/md;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/md;->e()Lcom/google/android/gms/internal/firebase-auth-api/pd;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/fd;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ed;)V

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->c(Lcom/google/android/gms/internal/firebase-auth-api/pd;)Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/hv;->b([BLcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/hv;

    move-result-object p2

    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->b(Lcom/google/android/gms/internal/firebase-auth-api/hv;)Lcom/google/android/gms/internal/firebase-auth-api/fd;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->e()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->a(Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->d()Lcom/google/android/gms/internal/firebase-auth-api/hd;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Only version 0 keys are accepted"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Parsing AesGcmKey failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong type URL in call to AesGcmParameters.parseParameters"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
