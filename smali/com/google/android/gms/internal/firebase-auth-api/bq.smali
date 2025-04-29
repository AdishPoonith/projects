.class public final Lcom/google/android/gms/internal/firebase-auth-api/bq;
.super Lcom/google/android/gms/internal/firebase-auth-api/r5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/bq;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/firebase-auth-api/lq;

.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/vp;

.field private zzf:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bq;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/bq;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/bq;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->m(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;-><init>()V

    return-void
.end method

.method public static D()Lcom/google/android/gms/internal/firebase-auth-api/aq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/bq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->v()Lcom/google/android/gms/internal/firebase-auth-api/o5;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/aq;

    return-object v0
.end method

.method static synthetic E()Lcom/google/android/gms/internal/firebase-auth-api/bq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/bq;

    return-object v0
.end method

.method public static F()Lcom/google/android/gms/internal/firebase-auth-api/bq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/bq;

    return-object v0
.end method

.method static synthetic H(Lcom/google/android/gms/internal/firebase-auth-api/bq;Lcom/google/android/gms/internal/firebase-auth-api/lq;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/lq;

    return-void
.end method

.method static synthetic I(Lcom/google/android/gms/internal/firebase-auth-api/bq;Lcom/google/android/gms/internal/firebase-auth-api/vp;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zze:Lcom/google/android/gms/internal/firebase-auth-api/vp;

    return-void
.end method

.method static synthetic K(Lcom/google/android/gms/internal/firebase-auth-api/bq;I)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->a(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zzf:I

    return-void
.end method


# virtual methods
.method public final C()Lcom/google/android/gms/internal/firebase-auth-api/vp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zze:Lcom/google/android/gms/internal/firebase-auth-api/vp;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/vp;->E()Lcom/google/android/gms/internal/firebase-auth-api/vp;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final G()Lcom/google/android/gms/internal/firebase-auth-api/lq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/lq;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->E()Lcom/google/android/gms/internal/firebase-auth-api/lq;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final J()I
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zzf:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x5

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    :cond_3
    :goto_0
    if-nez v1, :cond_4

    return v3

    :cond_4
    return v1
.end method

.method protected final t(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/bq;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/aq;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/aq;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zp;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/bq;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bq;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zzd"

    aput-object v1, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/bq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/bq;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u000c"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->j(Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
