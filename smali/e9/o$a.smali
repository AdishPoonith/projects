.class Le9/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/d$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/o;->m(Ls1/s;Le9/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Le9/n;

.field final synthetic b:Le9/o;


# direct methods
.method constructor <init>(Le9/o;Le9/n;)V
    .locals 0

    iput-object p1, p0, Le9/o$a;->b:Le9/o;

    iput-object p2, p0, Le9/o$a;->a:Le9/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lr8/d$b;)V
    .locals 0

    iget-object p1, p0, Le9/o$a;->a:Le9/n;

    invoke-virtual {p1, p2}, Le9/n;->f(Lr8/d$b;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Le9/o$a;->a:Le9/n;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Le9/n;->f(Lr8/d$b;)V

    return-void
.end method
