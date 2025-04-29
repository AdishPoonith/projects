.class public final Lcom/google/android/gms/internal/firebase-auth-api/vr;
.super Lcom/google/android/gms/internal/firebase-auth-api/r5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/vr;


# instance fields
.field private zzd:Ljava/lang/String;

.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/m4;

.field private zzf:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/vr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vr;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/vr;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/vr;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->m(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzd:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zze:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-void
.end method

.method public static C()Lcom/google/android/gms/internal/firebase-auth-api/sr;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/vr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->v()Lcom/google/android/gms/internal/firebase-auth-api/o5;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/sr;

    return-object v0
.end method

.method static synthetic E()Lcom/google/android/gms/internal/firebase-auth-api/vr;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/vr;

    return-object v0
.end method

.method public static F()Lcom/google/android/gms/internal/firebase-auth-api/vr;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/vr;

    return-object v0
.end method

.method static synthetic I(Lcom/google/android/gms/internal/firebase-auth-api/vr;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzd:Ljava/lang/String;

    return-void
.end method

.method static synthetic J(Lcom/google/android/gms/internal/firebase-auth-api/vr;Lcom/google/android/gms/internal/firebase-auth-api/m4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zze:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-void
.end method

.method static synthetic K(Lcom/google/android/gms/internal/firebase-auth-api/vr;Lcom/google/android/gms/internal/firebase-auth-api/ur;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ur;->zza()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzf:I

    return-void
.end method


# virtual methods
.method public final D()Lcom/google/android/gms/internal/firebase-auth-api/ur;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzf:I

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ur;->k:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ur;->o:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ur;->n:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ur;->m:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    goto :goto_0

    :cond_3
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ur;->l:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    :cond_4
    :goto_0
    if-nez v1, :cond_5

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->p:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    return-object v0

    :cond_5
    return-object v1
.end method

.method public final G()Lcom/google/android/gms/internal/firebase-auth-api/m4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zze:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-object v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzd:Ljava/lang/String;

    return-object v0
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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/vr;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/sr;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/sr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/rr;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/vr;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vr;-><init>()V

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

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/vr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/vr;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\u000c"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->j(Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
