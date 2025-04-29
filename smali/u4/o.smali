.class final Lu4/o;
.super Lv4/g;
.source "SourceFile"


# instance fields
.field final synthetic a:Lu4/c$e;


# direct methods
.method constructor <init>(Lu4/c;Lu4/c$e;)V
    .locals 0

    iput-object p2, p0, Lu4/o;->a:Lu4/c$e;

    invoke-direct {p0}, Lv4/g;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lr4/b;)V
    .locals 2

    iget-object v0, p0, Lu4/o;->a:Lu4/c$e;

    new-instance v1, Lw4/l;

    invoke-direct {v1, p1}, Lw4/l;-><init>(Lr4/b;)V

    invoke-interface {v0, v1}, Lu4/c$e;->c(Lw4/l;)V

    return-void
.end method
