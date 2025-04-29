.class Li9/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Li9/t;

.field b:Ljava/util/concurrent/Executor;

.field c:Ljava/lang/String;

.field d:Li9/b;

.field e:Ljava/lang/String;

.field f:[[Ljava/lang/Object;

.field g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li9/k$a;",
            ">;"
        }
    .end annotation
.end field

.field h:Ljava/lang/Boolean;

.field i:Ljava/lang/Integer;

.field j:Ljava/lang/Integer;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Li9/c$b;)Li9/c;
    .locals 0

    invoke-direct {p0}, Li9/c$b;->b()Li9/c;

    move-result-object p0

    return-object p0
.end method

.method private b()Li9/c;
    .locals 2

    new-instance v0, Li9/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li9/c;-><init>(Li9/c$b;Li9/c$a;)V

    return-object v0
.end method
