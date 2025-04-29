.class public final Ln5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln5/a$b;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/String; = "a"


# instance fields
.field private final a:Lg5/p;

.field private final b:Lg5/a;

.field private c:Lg5/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ln5/a$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln5/a$b;->a(Ln5/a$b;)Lg5/p;

    move-result-object v0

    iput-object v0, p0, Ln5/a;->a:Lg5/p;

    invoke-static {p1}, Ln5/a$b;->b(Ln5/a$b;)Lg5/a;

    move-result-object v0

    iput-object v0, p0, Ln5/a;->b:Lg5/a;

    invoke-static {p1}, Ln5/a$b;->c(Ln5/a$b;)Lg5/n;

    move-result-object p1

    iput-object p1, p0, Ln5/a;->c:Lg5/n;

    return-void
.end method

.method synthetic constructor <init>(Ln5/a$b;Ln5/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ln5/a;-><init>(Ln5/a$b;)V

    return-void
.end method

.method static synthetic a()Z
    .locals 1

    invoke-static {}, Ln5/a;->d()Z

    move-result v0

    return v0
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Ln5/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method private static d()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public declared-synchronized c()Lg5/m;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ln5/a;->c:Lg5/n;

    invoke-virtual {v0}, Lg5/n;->d()Lg5/m;

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
