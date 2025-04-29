.class public final Lcom/google/android/gms/internal/firebase-auth-api/oi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/Object;

.field private static final e:Ljava/lang/String; = "oi"

.field public static final synthetic f:I


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/qa;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/s9;

.field private final c:Lcom/google/android/gms/internal/firebase-auth-api/oa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/oi;->d:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/mi;Lcom/google/android/gms/internal/firebase-auth-api/ni;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/ri;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mi;->a(Lcom/google/android/gms/internal/firebase-auth-api/mi;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mi;->h(Lcom/google/android/gms/internal/firebase-auth-api/mi;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mi;->i(Lcom/google/android/gms/internal/firebase-auth-api/mi;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p2, v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ri;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/oi;->a:Lcom/google/android/gms/internal/firebase-auth-api/qa;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mi;->b(Lcom/google/android/gms/internal/firebase-auth-api/mi;)Lcom/google/android/gms/internal/firebase-auth-api/s9;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/oi;->b:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mi;->c(Lcom/google/android/gms/internal/firebase-auth-api/mi;)Lcom/google/android/gms/internal/firebase-auth-api/oa;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/oi;->c:Lcom/google/android/gms/internal/firebase-auth-api/oa;

    return-void
.end method

.method static bridge synthetic b()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/oi;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static bridge synthetic c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/oi;->e:Ljava/lang/String;

    return-object v0
.end method

.method static bridge synthetic d()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final declared-synchronized a()Lcom/google/android/gms/internal/firebase-auth-api/na;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/oi;->c:Lcom/google/android/gms/internal/firebase-auth-api/oa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/oa;->b()Lcom/google/android/gms/internal/firebase-auth-api/na;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
