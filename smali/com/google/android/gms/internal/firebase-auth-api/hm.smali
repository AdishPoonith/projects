.class public final Lcom/google/android/gms/internal/firebase-auth-api/hm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/android/gms/internal/firebase-auth-api/hm;

.field public static final c:Lcom/google/android/gms/internal/firebase-auth-api/hm;

.field public static final d:Lcom/google/android/gms/internal/firebase-auth-api/hm;

.field public static final e:Lcom/google/android/gms/internal/firebase-auth-api/hm;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/hm;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hm;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hm;->b:Lcom/google/android/gms/internal/firebase-auth-api/hm;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/hm;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hm;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hm;->c:Lcom/google/android/gms/internal/firebase-auth-api/hm;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/hm;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hm;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hm;->d:Lcom/google/android/gms/internal/firebase-auth-api/hm;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/hm;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hm;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hm;->e:Lcom/google/android/gms/internal/firebase-auth-api/hm;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hm;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hm;->a:Ljava/lang/String;

    return-object v0
.end method
