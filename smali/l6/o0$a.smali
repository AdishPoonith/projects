.class public Ll6/o0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/f4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll6/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private final a:Lq6/g;

.field private final b:Ll6/i0;

.field private c:Z

.field private d:Lq6/g$b;

.field final synthetic e:Ll6/o0;


# direct methods
.method public constructor <init>(Ll6/o0;Lq6/g;Ll6/i0;)V
    .locals 0

    iput-object p1, p0, Ll6/o0$a;->e:Ll6/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll6/o0$a;->c:Z

    iput-object p2, p0, Ll6/o0$a;->a:Lq6/g;

    iput-object p3, p0, Ll6/o0$a;->b:Ll6/i0;

    return-void
.end method

.method public static synthetic a(Ll6/o0$a;)V
    .locals 0

    invoke-direct {p0}, Ll6/o0$a;->b()V

    return-void
.end method

.method private synthetic b()V
    .locals 2

    iget-object v0, p0, Ll6/o0$a;->b:Ll6/i0;

    iget-object v1, p0, Ll6/o0$a;->e:Ll6/o0;

    invoke-virtual {v0, v1}, Ll6/i0;->y(Ll6/o0;)Ll6/o0$c;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll6/o0$a;->c:Z

    invoke-direct {p0}, Ll6/o0$a;->c()V

    return-void
.end method

.method private c()V
    .locals 5

    iget-boolean v0, p0, Ll6/o0$a;->c:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ll6/o0;->c()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ll6/o0;->d()J

    move-result-wide v0

    :goto_0
    iget-object v2, p0, Ll6/o0$a;->a:Lq6/g;

    sget-object v3, Lq6/g$d;->q:Lq6/g$d;

    new-instance v4, Ll6/n0;

    invoke-direct {v4, p0}, Ll6/n0;-><init>(Ll6/o0$a;)V

    invoke-virtual {v2, v3, v0, v1, v4}, Lq6/g;->k(Lq6/g$d;JLjava/lang/Runnable;)Lq6/g$b;

    move-result-object v0

    iput-object v0, p0, Ll6/o0$a;->d:Lq6/g$b;

    return-void
.end method


# virtual methods
.method public start()V
    .locals 5

    iget-object v0, p0, Ll6/o0$a;->e:Ll6/o0;

    invoke-static {v0}, Ll6/o0;->b(Ll6/o0;)Ll6/o0$b;

    move-result-object v0

    iget-wide v0, v0, Ll6/o0$b;->a:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-direct {p0}, Ll6/o0$a;->c()V

    :cond_0
    return-void
.end method

.method public stop()V
    .locals 1

    iget-object v0, p0, Ll6/o0$a;->d:Lq6/g$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq6/g$b;->c()V

    :cond_0
    return-void
.end method
