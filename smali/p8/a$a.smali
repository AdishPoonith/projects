.class Lp8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp8/a;


# direct methods
.method constructor <init>(Lp8/a;)V
    .locals 0

    iput-object p1, p0, Lp8/a$a;->a:Lp8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lp8/a$a;->a:Lp8/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lp8/a;->b(Lp8/a;Z)Z

    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lp8/a$a;->a:Lp8/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/a;->b(Lp8/a;Z)Z

    return-void
.end method
