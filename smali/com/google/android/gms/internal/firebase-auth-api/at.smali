.class public final Lcom/google/android/gms/internal/firebase-auth-api/at;
.super Lcom/google/android/gms/internal/firebase-auth-api/r5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/at;


# instance fields
.field private zzd:Ljava/lang/String;

.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/as;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/at;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/at;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/at;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/at;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/at;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->m(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/at;->zzd:Ljava/lang/String;

    return-void
.end method

.method static synthetic D()Lcom/google/android/gms/internal/firebase-auth-api/at;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/at;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/at;

    return-object v0
.end method

.method public static E()Lcom/google/android/gms/internal/firebase-auth-api/at;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/at;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/at;

    return-object v0
.end method

.method public static F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/at;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/at;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/at;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->z(Lcom/google/android/gms/internal/firebase-auth-api/r5;Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/at;

    return-object p0
.end method


# virtual methods
.method public final C()Lcom/google/android/gms/internal/firebase-auth-api/as;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/at;->zze:Lcom/google/android/gms/internal/firebase-auth-api/as;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/as;->E()Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/at;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final H()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/at;->zze:Lcom/google/android/gms/internal/firebase-auth-api/as;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final t(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/at;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/at;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zs;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ys;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/at;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/at;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/at;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/at;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->j(Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
