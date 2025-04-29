.class final Lu4/k;
.super Lv4/o;
.source "SourceFile"


# instance fields
.field final synthetic a:Lu4/f;


# direct methods
.method constructor <init>(Lu4/l;Lu4/f;)V
    .locals 0

    iput-object p2, p0, Lu4/k;->a:Lu4/f;

    invoke-direct {p0}, Lv4/o;-><init>()V

    return-void
.end method


# virtual methods
.method public final B0(Lv4/b;)V
    .locals 2

    iget-object v0, p0, Lu4/k;->a:Lu4/f;

    new-instance v1, Lu4/c;

    invoke-direct {v1, p1}, Lu4/c;-><init>(Lv4/b;)V

    invoke-interface {v0, v1}, Lu4/f;->v(Lu4/c;)V

    return-void
.end method
