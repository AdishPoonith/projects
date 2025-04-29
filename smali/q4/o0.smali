.class final Lq4/o0;
.super Lq4/m0;
.source "SourceFile"


# instance fields
.field private final l:Lq4/q0;


# direct methods
.method constructor <init>(Lq4/q0;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lq4/m0;-><init>(II)V

    iput-object p1, p0, Lq4/o0;->l:Lq4/q0;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq4/o0;->l:Lq4/q0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
