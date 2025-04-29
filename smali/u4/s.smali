.class final Lu4/s;
.super Lv4/x;
.source "SourceFile"


# instance fields
.field final synthetic a:Lu4/c$l;


# direct methods
.method constructor <init>(Lu4/c;Lu4/c$l;)V
    .locals 0

    iput-object p2, p0, Lu4/s;->a:Lu4/c$l;

    invoke-direct {p0}, Lv4/x;-><init>()V

    return-void
.end method


# virtual methods
.method public final t1(Lr4/h;)V
    .locals 2

    iget-object v0, p0, Lu4/s;->a:Lu4/c$l;

    new-instance v1, Lw4/q;

    invoke-direct {v1, p1}, Lw4/q;-><init>(Lr4/h;)V

    invoke-interface {v0, v1}, Lu4/c$l;->h(Lw4/q;)V

    return-void
.end method
