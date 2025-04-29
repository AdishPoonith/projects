.class public final synthetic Lq0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/j0$b;


# instance fields
.field public final synthetic a:Lq0/a;

.field public final synthetic b:Lp0/j0;

.field public final synthetic c:Lq0/e0;

.field public final synthetic d:Lq0/b0;


# direct methods
.method public synthetic constructor <init>(Lq0/a;Lp0/j0;Lq0/e0;Lq0/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/l;->a:Lq0/a;

    iput-object p2, p0, Lq0/l;->b:Lp0/j0;

    iput-object p3, p0, Lq0/l;->c:Lq0/e0;

    iput-object p4, p0, Lq0/l;->d:Lq0/b0;

    return-void
.end method


# virtual methods
.method public final b(Lp0/o0;)V
    .locals 4

    iget-object v0, p0, Lq0/l;->a:Lq0/a;

    iget-object v1, p0, Lq0/l;->b:Lp0/j0;

    iget-object v2, p0, Lq0/l;->c:Lq0/e0;

    iget-object v3, p0, Lq0/l;->d:Lq0/b0;

    invoke-static {v0, v1, v2, v3, p1}, Lq0/m;->d(Lq0/a;Lp0/j0;Lq0/e0;Lq0/b0;Lp0/o0;)V

    return-void
.end method
