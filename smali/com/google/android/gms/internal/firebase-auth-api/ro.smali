.class public final Lcom/google/android/gms/internal/firebase-auth-api/ro;
.super Lcom/google/android/gms/internal/firebase-auth-api/r5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/ro;


# instance fields
.field private zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ro;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ro;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ro;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ro;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/ro;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->m(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;-><init>()V

    return-void
.end method

.method public static D()Lcom/google/android/gms/internal/firebase-auth-api/qo;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ro;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ro;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->v()Lcom/google/android/gms/internal/firebase-auth-api/o5;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/qo;

    return-object v0
.end method

.method static synthetic E()Lcom/google/android/gms/internal/firebase-auth-api/ro;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ro;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ro;

    return-object v0
.end method

.method public static F()Lcom/google/android/gms/internal/firebase-auth-api/ro;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ro;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ro;

    return-object v0
.end method

.method static synthetic G(Lcom/google/android/gms/internal/firebase-auth-api/ro;I)V
    .locals 0

    const/16 p1, 0x10

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ro;->zzd:I

    return-void
.end method


# virtual methods
.method public final C()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ro;->zzd:I

    return v0
.end method

.method protected final t(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/ro;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ro;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/qo;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/qo;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/po;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/ro;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ro;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "zzd"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/ro;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ro;

    const-string p3, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->j(Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
