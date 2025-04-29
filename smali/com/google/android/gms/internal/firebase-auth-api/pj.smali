.class public final Lcom/google/android/gms/internal/firebase-auth-api/pj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lcom/google/android/gms/internal/firebase-auth-api/pj;

.field private static final c:Lcom/google/android/gms/internal/firebase-auth-api/oj;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/pj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/pj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pj;->b:Lcom/google/android/gms/internal/firebase-auth-api/pj;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/oj;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/oj;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/nj;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pj;->c:Lcom/google/android/gms/internal/firebase-auth-api/oj;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/pj;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/firebase-auth-api/pj;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pj;->b:Lcom/google/android/gms/internal/firebase-auth-api/pj;

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/dn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/pj;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/dn;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pj;->c:Lcom/google/android/gms/internal/firebase-auth-api/oj;

    :cond_0
    return-object v0
.end method
