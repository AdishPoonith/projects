.class final Lu4/j;
.super Lv4/q;
.source "SourceFile"


# instance fields
.field final synthetic a:Lu4/c$i;


# direct methods
.method constructor <init>(Lu4/c;Lu4/c$i;)V
    .locals 0

    iput-object p2, p0, Lu4/j;->a:Lu4/c$i;

    invoke-direct {p0}, Lv4/q;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lr4/b;)Z
    .locals 2

    iget-object v0, p0, Lu4/j;->a:Lu4/c$i;

    new-instance v1, Lw4/l;

    invoke-direct {v1, p1}, Lw4/l;-><init>(Lr4/b;)V

    invoke-interface {v0, v1}, Lu4/c$i;->R(Lw4/l;)Z

    move-result p1

    return p1
.end method
