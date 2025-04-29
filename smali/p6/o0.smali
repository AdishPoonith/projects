.class public final synthetic Lp6/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Lp6/p0;

.field public final synthetic b:Lq6/g;


# direct methods
.method public synthetic constructor <init>(Lp6/p0;Lq6/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/o0;->a:Lp6/p0;

    iput-object p2, p0, Lp6/o0;->b:Lq6/g;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lp6/o0;->a:Lp6/p0;

    iget-object v1, p0, Lp6/o0;->b:Lq6/g;

    check-cast p1, Lp6/l$a;

    invoke-static {v0, v1, p1}, Lp6/p0;->c(Lp6/p0;Lq6/g;Lp6/l$a;)V

    return-void
.end method
