.class public final Lo3/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo3/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lo3/l$a;

.field private c:Lo3/p0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lo3/u$b;

    invoke-direct {v0}, Lo3/u$b;-><init>()V

    invoke-direct {p0, p1, v0}, Lo3/t$a;-><init>(Landroid/content/Context;Lo3/l$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo3/l$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lo3/t$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lo3/t$a;->b:Lo3/l$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lo3/l;
    .locals 1

    invoke-virtual {p0}, Lo3/t$a;->b()Lo3/t;

    move-result-object v0

    return-object v0
.end method

.method public b()Lo3/t;
    .locals 3

    new-instance v0, Lo3/t;

    iget-object v1, p0, Lo3/t$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lo3/t$a;->b:Lo3/l$a;

    invoke-interface {v2}, Lo3/l$a;->a()Lo3/l;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo3/t;-><init>(Landroid/content/Context;Lo3/l;)V

    iget-object v1, p0, Lo3/t$a;->c:Lo3/p0;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lo3/t;->h(Lo3/p0;)V

    :cond_0
    return-object v0
.end method
