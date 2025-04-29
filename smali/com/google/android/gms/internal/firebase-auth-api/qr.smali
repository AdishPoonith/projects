.class public final Lcom/google/android/gms/internal/firebase-auth-api/qr;
.super Lcom/google/android/gms/internal/firebase-auth-api/r5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/qr;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/kr;

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/m4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/qr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/qr;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/qr;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/qr;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->m(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-void
.end method

.method public static E()Lcom/google/android/gms/internal/firebase-auth-api/pr;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/qr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->v()Lcom/google/android/gms/internal/firebase-auth-api/o5;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/pr;

    return-object v0
.end method

.method static synthetic F()Lcom/google/android/gms/internal/firebase-auth-api/qr;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/qr;

    return-object v0
.end method

.method public static G()Lcom/google/android/gms/internal/firebase-auth-api/qr;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/qr;

    return-object v0
.end method

.method public static H(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/qr;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/qr;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->z(Lcom/google/android/gms/internal/firebase-auth-api/r5;Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/qr;

    return-object p0
.end method

.method static synthetic J(Lcom/google/android/gms/internal/firebase-auth-api/qr;I)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzd:I

    return-void
.end method

.method static synthetic K(Lcom/google/android/gms/internal/firebase-auth-api/qr;Lcom/google/android/gms/internal/firebase-auth-api/kr;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zze:Lcom/google/android/gms/internal/firebase-auth-api/kr;

    return-void
.end method

.method static synthetic L(Lcom/google/android/gms/internal/firebase-auth-api/qr;Lcom/google/android/gms/internal/firebase-auth-api/m4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-void
.end method


# virtual methods
.method public final C()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzd:I

    return v0
.end method

.method public final D()Lcom/google/android/gms/internal/firebase-auth-api/kr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zze:Lcom/google/android/gms/internal/firebase-auth-api/kr;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/kr;->E()Lcom/google/android/gms/internal/firebase-auth-api/kr;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final I()Lcom/google/android/gms/internal/firebase-auth-api/m4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-object v0
.end method

.method public final M()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zze:Lcom/google/android/gms/internal/firebase-auth-api/kr;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/qr;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/pr;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/pr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/or;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/qr;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/qr;-><init>()V

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

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/qr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/qr;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->j(Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
