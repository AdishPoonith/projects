.class public final enum Lcom/google/android/gms/internal/firebase-auth-api/ur;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/t5;


# static fields
.field public static final enum k:Lcom/google/android/gms/internal/firebase-auth-api/ur;

.field public static final enum l:Lcom/google/android/gms/internal/firebase-auth-api/ur;

.field public static final enum m:Lcom/google/android/gms/internal/firebase-auth-api/ur;

.field public static final enum n:Lcom/google/android/gms/internal/firebase-auth-api/ur;

.field public static final enum o:Lcom/google/android/gms/internal/firebase-auth-api/ur;

.field public static final enum p:Lcom/google/android/gms/internal/firebase-auth-api/ur;

.field private static final q:Lcom/google/android/gms/internal/firebase-auth-api/u5;

.field private static final synthetic r:[Lcom/google/android/gms/internal/firebase-auth-api/ur;


# instance fields
.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;

    const-string v1, "UNKNOWN_KEYMATERIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ur;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->k:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ur;

    const-string v3, "SYMMETRIC"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/firebase-auth-api/ur;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ur;->l:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/ur;

    const-string v5, "ASYMMETRIC_PRIVATE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/firebase-auth-api/ur;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ur;->m:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    new-instance v5, Lcom/google/android/gms/internal/firebase-auth-api/ur;

    const-string v7, "ASYMMETRIC_PUBLIC"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/google/android/gms/internal/firebase-auth-api/ur;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/firebase-auth-api/ur;->n:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    new-instance v7, Lcom/google/android/gms/internal/firebase-auth-api/ur;

    const-string v9, "REMOTE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/google/android/gms/internal/firebase-auth-api/ur;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/firebase-auth-api/ur;->o:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    new-instance v9, Lcom/google/android/gms/internal/firebase-auth-api/ur;

    const-string v11, "UNRECOGNIZED"

    const/4 v12, 0x5

    const/4 v13, -0x1

    invoke-direct {v9, v11, v12, v13}, Lcom/google/android/gms/internal/firebase-auth-api/ur;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/firebase-auth-api/ur;->p:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    const/4 v11, 0x6

    new-array v11, v11, [Lcom/google/android/gms/internal/firebase-auth-api/ur;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lcom/google/android/gms/internal/firebase-auth-api/ur;->r:[Lcom/google/android/gms/internal/firebase-auth-api/ur;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/tr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/tr;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->q:Lcom/google/android/gms/internal/firebase-auth-api/u5;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->j:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/firebase-auth-api/ur;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->r:[Lcom/google/android/gms/internal/firebase-auth-api/ur;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/firebase-auth-api/ur;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/firebase-auth-api/ur;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ur;->zza()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->p:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->j:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
