.class public final synthetic Ll6/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/l;


# direct methods
.method public synthetic constructor <init>(Ll6/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/h0;->a:Ll6/l;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ll6/h0;->a:Ll6/l;

    check-cast p1, Lm6/q;

    invoke-interface {v0, p1}, Ll6/l;->b(Lm6/q;)V

    return-void
.end method
