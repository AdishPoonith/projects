.class public final Lcom/google/android/gms/internal/firebase-auth-api/lu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/android/gms/internal/firebase-auth-api/lu;

.field public static final c:Lcom/google/android/gms/internal/firebase-auth-api/lu;

.field public static final d:Lcom/google/android/gms/internal/firebase-auth-api/lu;

.field public static final e:Lcom/google/android/gms/internal/firebase-auth-api/lu;

.field public static final f:Lcom/google/android/gms/internal/firebase-auth-api/lu;

.field public static final g:Lcom/google/android/gms/internal/firebase-auth-api/lu;

.field public static final h:Lcom/google/android/gms/internal/firebase-auth-api/lu;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/ku;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/mu;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/mu;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;->b:Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/qu;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/qu;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;->c:Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/su;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/su;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;->d:Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ru;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ru;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;->e:Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/nu;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/nu;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;->f:Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/pu;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/pu;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;->g:Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ou;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ou;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;->h:Lcom/google/android/gms/internal/firebase-auth-api/lu;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fg;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ju;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ju;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;Lcom/google/android/gms/internal/firebase-auth-api/hu;)V

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/lu;->a:Lcom/google/android/gms/internal/firebase-auth-api/ku;

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/cv;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/eu;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/eu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;Lcom/google/android/gms/internal/firebase-auth-api/du;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/gu;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/gu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/tu;Lcom/google/android/gms/internal/firebase-auth-api/fu;)V

    goto :goto_0
.end method

.method public static varargs b([Ljava/lang/String;)Ljava/util/List;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    aget-object v2, p0, v1

    invoke-static {v2}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/lu;->a:Lcom/google/android/gms/internal/firebase-auth-api/ku;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ku;->zza(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
