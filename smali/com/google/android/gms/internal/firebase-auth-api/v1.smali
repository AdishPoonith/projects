.class public final enum Lcom/google/android/gms/internal/firebase-auth-api/v1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum k:Lcom/google/android/gms/internal/firebase-auth-api/v1;

.field public static final enum l:Lcom/google/android/gms/internal/firebase-auth-api/v1;

.field private static final synthetic m:[Lcom/google/android/gms/internal/firebase-auth-api/v1;


# instance fields
.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/v1;

    const-string v1, "REFRESH_TOKEN"

    const/4 v2, 0x0

    const-string v3, "refresh_token"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/v1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/v1;->k:Lcom/google/android/gms/internal/firebase-auth-api/v1;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/v1;

    const-string v3, "AUTHORIZATION_CODE"

    const/4 v4, 0x1

    const-string v5, "authorization_code"

    invoke-direct {v1, v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/v1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/v1;->l:Lcom/google/android/gms/internal/firebase-auth-api/v1;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/android/gms/internal/firebase-auth-api/v1;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/google/android/gms/internal/firebase-auth-api/v1;->m:[Lcom/google/android/gms/internal/firebase-auth-api/v1;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/v1;->j:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/firebase-auth-api/v1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/v1;->m:[Lcom/google/android/gms/internal/firebase-auth-api/v1;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/firebase-auth-api/v1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/firebase-auth-api/v1;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v1;->j:Ljava/lang/String;

    return-object v0
.end method
