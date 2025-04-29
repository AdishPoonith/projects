.class public final synthetic Ll6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/y;


# instance fields
.field public final synthetic a:Ll6/i0;

.field public final synthetic b:Ll6/o0;


# direct methods
.method public synthetic constructor <init>(Ll6/i0;Ll6/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/w;->a:Ll6/i0;

    iput-object p2, p0, Ll6/w;->b:Ll6/o0;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ll6/w;->a:Ll6/i0;

    iget-object v1, p0, Ll6/w;->b:Ll6/o0;

    invoke-static {v0, v1}, Ll6/i0;->i(Ll6/i0;Ll6/o0;)Ll6/o0$c;

    move-result-object v0

    return-object v0
.end method
