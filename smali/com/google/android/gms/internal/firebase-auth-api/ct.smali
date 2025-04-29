.class public final enum Lcom/google/android/gms/internal/firebase-auth-api/ct;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/t5;


# static fields
.field public static final enum k:Lcom/google/android/gms/internal/firebase-auth-api/ct;

.field public static final enum l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

.field public static final enum m:Lcom/google/android/gms/internal/firebase-auth-api/ct;

.field public static final enum n:Lcom/google/android/gms/internal/firebase-auth-api/ct;

.field public static final enum o:Lcom/google/android/gms/internal/firebase-auth-api/ct;

.field public static final enum p:Lcom/google/android/gms/internal/firebase-auth-api/ct;

.field private static final q:Lcom/google/android/gms/internal/firebase-auth-api/u5;

.field private static final synthetic r:[Lcom/google/android/gms/internal/firebase-auth-api/ct;


# instance fields
.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ct;

    const-string v1, "UNKNOWN_PREFIX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ct;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->k:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ct;

    const-string v3, "TINK"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/firebase-auth-api/ct;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ct;->l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/ct;

    const-string v5, "LEGACY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/firebase-auth-api/ct;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ct;->m:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    new-instance v5, Lcom/google/android/gms/internal/firebase-auth-api/ct;

    const-string v7, "RAW"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/google/android/gms/internal/firebase-auth-api/ct;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/firebase-auth-api/ct;->n:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    new-instance v7, Lcom/google/android/gms/internal/firebase-auth-api/ct;

    const-string v9, "CRUNCHY"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/google/android/gms/internal/firebase-auth-api/ct;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/firebase-auth-api/ct;->o:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    new-instance v9, Lcom/google/android/gms/internal/firebase-auth-api/ct;

    const-string v11, "UNRECOGNIZED"

    const/4 v12, 0x5

    const/4 v13, -0x1

    invoke-direct {v9, v11, v12, v13}, Lcom/google/android/gms/internal/firebase-auth-api/ct;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/firebase-auth-api/ct;->p:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    const/4 v11, 0x6

    new-array v11, v11, [Lcom/google/android/gms/internal/firebase-auth-api/ct;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lcom/google/android/gms/internal/firebase-auth-api/ct;->r:[Lcom/google/android/gms/internal/firebase-auth-api/ct;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bt;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->q:Lcom/google/android/gms/internal/firebase-auth-api/u5;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->j:I

    return-void
.end method

.method public static b(I)Lcom/google/android/gms/internal/firebase-auth-api/ct;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->o:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->n:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->m:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    return-object p0

    :cond_3
    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    return-object p0

    :cond_4
    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->k:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    return-object p0
.end method

.method public static values()[Lcom/google/android/gms/internal/firebase-auth-api/ct;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->r:[Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/firebase-auth-api/ct;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/firebase-auth-api/ct;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ct;->zza()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->p:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->j:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
