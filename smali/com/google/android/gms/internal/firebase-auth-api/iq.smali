.class public final Lcom/google/android/gms/internal/firebase-auth-api/iq;
.super Lcom/google/android/gms/internal/firebase-auth-api/r5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/iq;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/bq;

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/m4;

.field private zzg:Lcom/google/android/gms/internal/firebase-auth-api/m4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/iq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/iq;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/iq;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/iq;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->m(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-void
.end method

.method public static E()Lcom/google/android/gms/internal/firebase-auth-api/hq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/iq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->v()Lcom/google/android/gms/internal/firebase-auth-api/o5;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/hq;

    return-object v0
.end method

.method static synthetic F()Lcom/google/android/gms/internal/firebase-auth-api/iq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/iq;

    return-object v0
.end method

.method public static G()Lcom/google/android/gms/internal/firebase-auth-api/iq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/iq;

    return-object v0
.end method

.method public static H(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/iq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/iq;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->z(Lcom/google/android/gms/internal/firebase-auth-api/r5;Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;

    return-object p0
.end method

.method static synthetic K(Lcom/google/android/gms/internal/firebase-auth-api/iq;I)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzd:I

    return-void
.end method

.method static synthetic L(Lcom/google/android/gms/internal/firebase-auth-api/iq;Lcom/google/android/gms/internal/firebase-auth-api/bq;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zze:Lcom/google/android/gms/internal/firebase-auth-api/bq;

    return-void
.end method

.method static synthetic M(Lcom/google/android/gms/internal/firebase-auth-api/iq;Lcom/google/android/gms/internal/firebase-auth-api/m4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-void
.end method

.method static synthetic N(Lcom/google/android/gms/internal/firebase-auth-api/iq;Lcom/google/android/gms/internal/firebase-auth-api/m4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-void
.end method


# virtual methods
.method public final C()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzd:I

    return v0
.end method

.method public final D()Lcom/google/android/gms/internal/firebase-auth-api/bq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zze:Lcom/google/android/gms/internal/firebase-auth-api/bq;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/bq;->F()Lcom/google/android/gms/internal/firebase-auth-api/bq;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final I()Lcom/google/android/gms/internal/firebase-auth-api/m4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-object v0
.end method

.method public final J()Lcom/google/android/gms/internal/firebase-auth-api/m4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-object v0
.end method

.method protected final t(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p2, 0x0

    if-eq p1, p3, :cond_1

    const/4 p3, 0x5

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/iq;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/hq;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/hq;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/gq;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/iq;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/iq;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zzd"

    aput-object v2, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/iq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/iq;

    const-string p3, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->j(Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
